import styled from 'styled-components';
import LeftNavBar from '../organism/LeftNavBar';
import TopBar from '../organism/TopBar';

const Bars = () => {
  return (
    <StyledBars>
      <LeftNavBar />
      <TopBar />
    </StyledBars>
  );
};

const StyledBars = styled.div`
  display: flex;
  justify-content: start;
  align-items: start;
`;

export default Bars;
