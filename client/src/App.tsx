import './utils/variables.scss';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import HomeTemplate from './components/template/HomeTemplate';

function App() {
  return (
    <BrowserRouter>
      <div className='App'>
        <HomeTemplate />
      </div>
    </BrowserRouter>
  );
}

export default App;
