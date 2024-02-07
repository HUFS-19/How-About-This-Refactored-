import { configureStore } from '@reduxjs/toolkit';
import categoryReducer from './slice/categorySlice';
import joinReducer from './slice/joinSlice';

const store = configureStore({
  reducer: {
    category: categoryReducer,
    join: joinReducer,
  },
});

export default store;

export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;
