import './utils/variables.scss';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import HomePage from './components/page/HomePage';
import ProductDetailPage from './components/page/ProductDetailPage';

function App() {
  return (
    <BrowserRouter>
      <div className='App'>
        <ProductDetailPage />
      </div>
    </BrowserRouter>
  );
}

export default App;
