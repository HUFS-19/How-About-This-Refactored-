import './utils/variables.scss';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Bars from './components/template/Bars';

function App() {
  return (
    <BrowserRouter>
      <div className='App'>
        <Bars />
      </div>
    </BrowserRouter>
  );
}

export default App;
