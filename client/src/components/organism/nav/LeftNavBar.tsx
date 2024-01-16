import Logo from '../../atom/Logo';
import AccountArea from '../../molecule/AccountArea';
import CategoryList from '../../molecule/CategoryList';

const LeftNavBar = () => {
  return (
    <div className='LeftNavBar'>
      <Logo />
      <AccountArea />
      <CategoryList />
    </div>
  );
};

export default LeftNavBar;
