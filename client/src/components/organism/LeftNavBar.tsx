import styled from 'styled-components';

import Logo from '../atom/Logo';
import AccountArea from '../molecule/AccountArea';
import CategoryList from '../molecule/CategoryList';

const LeftNavBar = () => {
  return (
    <StyledLeftNavBar>
      <Logo />
      <AccountArea />
      <CategoryList />
    </StyledLeftNavBar>
  );
};

export const StyledLeftNavBar = styled.div`
  background-color: white;
  width: 270px;
  height: 100vh;
  padding: 50px 0;
  box-shadow: 1px 0px 10px lightgray;

  & > * {
    margin-bottom: 70px;
  }
`;

export default LeftNavBar;
