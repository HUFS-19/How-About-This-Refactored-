import './utils/variables.scss';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import LeftNavBar from './components/organism/LeftNavBar';
import TopBar from './components/organism/TopBar';

function App() {
  return (
    <BrowserRouter>
      <div className='App'>
        <LeftNavBar />
        <TopBar />
      </div>
    </BrowserRouter>
  );
}

export default App;
