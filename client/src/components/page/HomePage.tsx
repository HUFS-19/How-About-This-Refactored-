import LayoutTemplate from '../template/LayoutTemplate';
import ProductListBox from '../organism/ProductListBox';

const HomePage = () => {
  return <LayoutTemplate children={ProductListBox()} />;
};

export default HomePage;
