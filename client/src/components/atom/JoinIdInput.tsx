import styled from 'styled-components';
import MediumText from '../atom/MediumText';
import Input from '../atom/Input';
import Button from './Button';
import { useSelector, useDispatch } from 'react-redux';
import { RootState } from '../../store/store';
import { setJoinId, checkId } from '../../store/slice/joinSlice';

const JoinIdInput = () => {
  const dispatch = useDispatch();
  const { isValidId } = useSelector((state: RootState) => state.join);
  const onChangeId = (e: any) => {
    const idReg = /^[a-zA-Z0-9]*$/;
    dispatch(setJoinId(e.target.value));
    if (!idReg.test(e.target.value)) {
      dispatch(checkId(false));
    } else if (e.target.value.length < 5 || e.target.value.length >= 12) {
      dispatch(checkId(false));
    } else {
      dispatch(checkId(true));
    }
  };

  return (
    <StyledJoinIdInput>
      <MediumText text='아이디' />
      <StyledIdInput>
        <Input width='230px' padding='12px 10px' onChange={onChangeId} />
        <Button width='100px' height='48px' text='중복확인' />
      </StyledIdInput>
      {isValidId || (
        <ErrorMsg>5~12글자로 영문자와 숫자만 사용하여 입력해주세요.</ErrorMsg>
      )}
    </StyledJoinIdInput>
  );
};

export const StyledJoinIdInput = styled.div`
  & > :first-child,
  & > :last-child {
    margin-bottom: 10px;
  }
`;

export const StyledIdInput = styled.div`
  display: flex;
  justify-content: space-between;
`;

export const ErrorMsg = styled.p`
  color: red;
  font-size: 13px;
  padding: 10px 0;
`;

export default JoinIdInput;
