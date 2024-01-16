import { BrowserRouter, Routes, Route } from 'react-router-dom';

import LeftNavBar from './components/organism/nav/LeftNavBar';

function App() {
  return (
    <BrowserRouter>
      <div className='App'>
        <LeftNavBar />
      </div>
    </BrowserRouter>
  );
}

export default App;
