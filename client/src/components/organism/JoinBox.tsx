import styled from 'styled-components';
import Title from '../atom/Title';
import Box from '../atom/Box';
import JoinInput from '../molecule/JoinInput';
import JoinBtns from '../molecule/JoinBtn';

const Join = () => {
  return (
    <StyledJoin>
      <Box width='800px' height='600px'>
        <StyledBox>
          <Title text='회원가입' />
          <JoinInput />
          <JoinBtns />
        </StyledBox>
      </Box>
    </StyledJoin>
  );
};

export const StyledJoin = styled.div`
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

export default Join;
