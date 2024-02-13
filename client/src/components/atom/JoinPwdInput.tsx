import { useState } from 'react';
import styled from 'styled-components';
import Input from '../atom/Input';
import MediumText from '../atom/MediumText';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faEye, faEyeSlash } from '@fortawesome/free-solid-svg-icons';
import { useSelector, useDispatch } from 'react-redux';
import { RootState } from '../../store/store';
import {
  setJoinPassword,
  checkPassword,
  checkMatch,
} from '../../store/slice/joinSlice';

const JoinPwdInput = () => {
  const [passwordVisible, setPasswordVisible] = useState(false);
  const dispatch = useDispatch();
  const { isValidPassword, joinPassword, passwordMatch } = useSelector(
    (state: RootState) => state.join,
  );

  const onChangePwd = (e: any) => {
    const passwordReg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{10,}$/;
    dispatch(setJoinPassword(e.target.value));
    if (e.target.value.length < 10) {
      dispatch(checkPassword(false));
    } else if (!passwordReg.test(e.target.value)) {
      dispatch(checkPassword(false));
    } else {
      dispatch(checkPassword(true));
    }
  };

  const onChangePwdConfirm = (e: any) => {
    if (e.target.value !== joinPassword) {
      dispatch(checkMatch(false));
    } else {
      dispatch(checkMatch(true));
    }
  };

  const togglePasswordVisibility = () => {
    setPasswordVisible((prev) => !prev);
  };

  return (
    <StyledJoinPwdInput>
      <MediumText text='비밀번호' />
      <PasswordWrapper>
        <Input
          width='340px'
          padding='12px 10px'
          onChange={onChangePwd}
          type={passwordVisible ? 'text' : 'password'}
        />
        <StyledHideIcon
          icon={passwordVisible ? faEye : faEyeSlash}
          onClick={togglePasswordVisibility}
        />
        {isValidPassword || (
          <ErrorMsg>
            10글자 이상. 최소 1개의 영문자, 숫자, 특수문자를 포함해주세요.
          </ErrorMsg>
        )}
      </PasswordWrapper>
      <MediumText text='비밀번호 확인' />
      <PasswordWrapper>
        <Input
          width='340px'
          padding='12px 10px'
          onChange={onChangePwdConfirm}
          type='password'
        />
        {passwordMatch || <ErrorMsg>비밀번호가 일치하지 않습니다.</ErrorMsg>}
      </PasswordWrapper>
    </StyledJoinPwdInput>
  );
};

export default JoinPwdInput;

export const StyledJoinPwdInput = styled.div`
  & > * {
    margin-bottom: 10px;
  }
`;

export const PasswordWrapper = styled.div`
  position: relative;
`;

export const StyledHideIcon = styled(FontAwesomeIcon)`
  position: absolute;
  color: gray;
  width: 15px;
  right: 15px;
  top: 17px;
  cursor: pointer;
`;

export const ErrorMsg = styled.p`
  color: red;
  font-size: 13px;
  padding: 10px 0;
`;
