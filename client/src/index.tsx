import React from 'react';
import ReactDOM from 'react-dom/client';
import { GlobalStyles } from './styles/globalStyles';
import App from './App';
import store from './store/store';
import { Provider } from 'react-redux';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement,
);
root.render(
  <React.StrictMode>
    <Provider store={store}>
      <GlobalStyles />
      <App />
    </Provider>
  </React.StrictMode>,
);
