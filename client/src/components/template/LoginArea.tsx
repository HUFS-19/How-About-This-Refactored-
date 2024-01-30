import styled from 'styled-components';
import LoginBox from '../organism/LoginBox';

const LoginArea = () => {
  return (
    <StyledDiv>
      <LoginBox />
    </StyledDiv>
  );
};

const StyledDiv = styled.div`
  height: calc(100vh - 63px);
  display: flex;
  justify-content: center;
`;

export default LoginArea;
