import { createSlice, PayloadAction } from '@reduxjs/toolkit';

export interface CategoryState {
  selectedId: number;
}

const initialState: CategoryState = {
  selectedId: 0,
};

export const categorySlice = createSlice({
  name: 'category',
  initialState,
  reducers: {
    select: (state, action: PayloadAction<number>) => {
      state.selectedId = action.payload;
    },
  },
});

export const { select } = categorySlice.actions;

export default categorySlice.reducer;
