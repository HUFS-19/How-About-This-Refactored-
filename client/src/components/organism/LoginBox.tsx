import styled from 'styled-components';
import Title from '../atom/Title';
import LoginInput from '../molecule/LoginInput';
import Box from '../atom/Box';
import LoginBtns from '../molecule/LoginBtns';

const Login = () => {
  return (
    <StyledLogin>
      <Box width='800px' height='600px'>
        <StyledBox>
          <Title text='로그인' />
          <LoginInput />
          <LoginBtns />
        </StyledBox>
      </Box>
    </StyledLogin>
  );
};

export const StyledLogin = styled.div`
  display: flex;
  text-align: center;
  align-self: center;
`;

export const StyledBox = styled.div`
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  align-self: center;
  & > * {
    margin-bottom: 20px;
  }
`;

export default Login;
