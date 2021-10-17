import React from "react";
import ProductItem from "./ProductItem";
import "./ProductList.css";

const ProductList = (props) => {
  return (
    <div>
      <ul className="product-list">
        {props.products.map((product) => (
          <ProductItem
            key={Math.random()}
            title={product.productName}
            description={product.description}
            stack={product.stack}
            targetMarket={product.targetMarket}
          />
        ))}
      </ul>
    </div>
  );
};

export default ProductList;
