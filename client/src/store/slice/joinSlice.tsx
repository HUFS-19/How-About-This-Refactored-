import { createSlice, PayloadAction } from '@reduxjs/toolkit';

export interface JoinState {
  joinId: string;
  isValidId: boolean;
  joinPassword: string;
  isValidPassword: boolean;
  passwordMatch: boolean;
}

const initialState: JoinState = {
  joinId: '',
  isValidId: false,
  joinPassword: '',
  isValidPassword: false,
  passwordMatch: false,
};

export const joinSlice = createSlice({
  name: 'join',
  initialState,
  reducers: {
    setJoinId: (state, action: PayloadAction<string>) => {
      state.joinId = action.payload;
    },
    checkId: (state, action: PayloadAction<boolean>) => {
      state.isValidId = action.payload;
    },
    setJoinPassword: (state, action: PayloadAction<string>) => {
      state.joinPassword = action.payload;
    },
    checkPassword: (state, action: PayloadAction<boolean>) => {
      state.isValidPassword = action.payload;
    },
    checkMatch: (state, action: PayloadAction<boolean>) => {
      state.passwordMatch = action.payload;
    },
  },
});

export const {
  setJoinId,
  checkId,
  setJoinPassword,
  checkPassword,
  checkMatch,
} = joinSlice.actions;

export default joinSlice.reducer;
