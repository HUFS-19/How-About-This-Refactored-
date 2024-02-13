import styled from 'styled-components';
import JoinBox from '../organism/JoinBox';

const JoinArea = () => {
  return (
    <StyledDiv>
      <JoinBox />
    </StyledDiv>
  );
};

const StyledDiv = styled.div`
  height: calc(100vh - 200px);
  display: flex;
  justify-content: center;
`;

export default JoinArea;
