import Filter from "./components/Filter";

import { useCallback, useEffect, useState } from "react";
import axios from "axios";
import ProductList from "./components/ProductList";

function App() {
  const [filterValues, setFilterValues] = useState([]);
  const [products, setProducts] = useState([]);

  const fetchedProductsHandler = useCallback(async (value) => {
    try {
      let response = await axios.get(`http://localhost:8080/produtos/${value}`);
      setProducts(response.data);
    } catch (err) {
      console.log(err.message);
    }
  }, []);

  useEffect(() => {
    filterValues.forEach((value) => {
      fetchedProductsHandler(value);
    });
  }, [filterValues]);

  console.log(products);

  const filterDataHandler = (info) => {
    setFilterValues([...info]);
  };

  return (
    <div>
      <Filter onSubmitInfo={filterDataHandler} />
      <ProductList products={products} />;
    </div>
  );
}

export default App;
