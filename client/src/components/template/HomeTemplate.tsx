import LeftNavBar from '../organism/LeftNavBar';
import TopBar from '../organism/TopBar';
import MainBox from '../atom/MainBox';
import ProductListBox from '../organism/ProductListBox';

const HomeTemplate = () => {
  return (
    <>
      <LeftNavBar />
      <TopBar />
      <MainBox children={ProductListBox()} />
    </>
  );
};

export default HomeTemplate;
