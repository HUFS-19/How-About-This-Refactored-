import styled from 'styled-components';
import Button from '../atom/Button';

const LoginBtns = () => {
  return (
    <StyledLoginBtns>
      <Button text='로그인' color='grey' width='160px' height='40px' />
      <Button text='회원가입' color='white' width='160px' height='40px' />
    </StyledLoginBtns>
  );
};

export const StyledLoginBtns = styled.div`
  & > :first-child {
    margin-right: 35px;
  }
`;

export default LoginBtns;
