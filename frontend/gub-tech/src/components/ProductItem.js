import "./ProductItem.css";

const ProductItem = (props) => {
  return (
    <div className="product-item">
      <h1>{props.productName}</h1>
      <p>{props.description}</p>
      <p>Tecnologias</p>
      <ul>
        {props.stack.map((stack) => (
          <li key={Math.random()}>{stack}</li>
        ))}
      </ul>
      <p>Mercado Alvo</p>
      <ul>
        {props.targetMarket.map((target) => (
          <li key={Math.random()}>{target}</li>
        ))}
      </ul>
    </div>
  );
};

export default ProductItem;
