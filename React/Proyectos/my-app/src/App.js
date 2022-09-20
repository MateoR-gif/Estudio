import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  var mensajes = [
    'Bienvenido a Crapp. 😄', 'Bienvenido a Crapp. 😄', 'Bienvenido a Crapp. 😄', 'Bienvenido a Crapp. 😄', 'Bienvenido a Crapp. 😄', 'Bienvenido a Crapp. 😄',
    '¿Cómo va el día? 😏', '¿Cómo va el día? 😏', '¿Cómo va el día? 😏',
    "Q'hubo pai. 🤑",
    "Esa basura no se va a recoger sola. 🤨", "Esa basura no se va a recoger sola. 🤨",
    '"El Arte de la Guerra es doblegar al enemigo sin luchar" -Sun Tzu 👨‍🎓',
    '"Si vas a hacer algo, hazlo en grande o no hagas nada" -👞',
    '"Si hay solución, no hay problema." -? 🤔',
    '"Basura... ¿Tu ex?" 🤐',
    "No se van a enterar de que la basura la pusimos nosotros para el comercial, ¿Verdad? 🤫"
  ];

  const [msg, setMsg] = useState()
  const [buttonmsg, setBtnmsg] = useState(mensajes[Math.floor(Math.random() * mensajes.length)])
  const imprimir = () => {
    setMsg(buttonmsg)
    setBtnmsg(mensajes[Math.floor(Math.random() * mensajes.length)])
  }
  return (
    <div className="App">
      <div className="mensaje">
        <p>{msg}</p>
      </div>
      <div>
        <button onClick={imprimir}>{buttonmsg}</button>
      </div>
    </div>
  );
}

export default App;
