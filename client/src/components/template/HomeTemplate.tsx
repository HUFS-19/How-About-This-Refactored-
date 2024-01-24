import styled from 'styled-components';
import LeftNavBar from '../organism/LeftNavBar';
import TopBar from '../organism/TopBar';
import MainBox from '../organism/MainBox';

const HomeTemplate = () => {
  return (
    <StyledBars>
      <LeftNavBar />
      <StyledDiv>
        <TopBar />
        <MainBox />
      </StyledDiv>
    </StyledBars>
  );
};

const StyledBars = styled.div`
  display: flex;
  justify-content: start;
  align-items: start;
`;

const StyledDiv = styled.div`
  display: flex;
  flex-direction: column;
  width: 100%;
`;

export default HomeTemplate;
