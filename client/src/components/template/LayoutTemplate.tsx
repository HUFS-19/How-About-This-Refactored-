import LeftNavBar from '../organism/LeftNavBar';
import TopBar from '../organism/TopBar';
import MainBox from '../atom/MainBox';

interface LayoutTemplateProps {
  children: JSX.Element | JSX.Element[];
}

const LayoutTemplate = ({ children }: LayoutTemplateProps) => {
  return (
    <>
      <LeftNavBar />
      <TopBar />
      <MainBox children={children} />
    </>
  );
};

export default LayoutTemplate;
