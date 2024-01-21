import FlexBox from '../atom/FlexBox';
import LeftNavBar from '../organism/LeftNavBar';
import TopBar from '../organism/TopBar';

const Bars = () => {
  return (
    <FlexBox justifyContent='start' alignItems='start'>
      <LeftNavBar />
      <TopBar />
    </FlexBox>
  );
};

export default Bars;
