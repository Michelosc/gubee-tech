import { useState } from "react";
import "./Filter.css";

const Filter = (props) => {
  const [enteredFilter, setEnteredData] = useState("");
  const [filterValues, setFilterValues] = useState([]);

  const dataChangeHandler = (event) => {
    setEnteredData(event.target.value);
  };

  const addFilterClickHandler = (event) => {
    let filterValue = enteredFilter;
    setFilterValues((prevValue) => {
      return [...prevValue, filterValue];
    });
    setEnteredData("");
    event.preventDefault();
  };

  const submitHandler = (event) => {
    event.preventDefault();

    props.onSubmitInfo(filterValues);

    setEnteredData("");
    setFilterValues([]);
  };

  return (
    <div className="filter">
      <form onSubmit={submitHandler}>
        <label>Buscar</label>
        <input type="text" value={enteredFilter} onChange={dataChangeHandler} />
        <button onClick={addFilterClickHandler}>Adicionar Filtro</button>
        <button type="submit">Listar</button>
      </form>
      <div className="container-filtro">
        <div>
          <label>Filtros</label>
        </div>
        <div>
          {filterValues.map((filter) => (
            <span className="filter-value" key={Math.random()}>
              {filter}
            </span>
          ))}
        </div>
      </div>
    </div>
  );
};

export default Filter;
