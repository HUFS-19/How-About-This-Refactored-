import styled from 'styled-components';

import Logo from '../atom/Logo';
import NavLogin from '../molecule/NavLogin';
import NavProfile from '../molecule/NavProfile';
import CategoryList from '../molecule/CategoryList';

// todo: 로그인 여부에 따라 LavLogin/LavProfile 변경

const LeftNavBar = () => {
  return (
    <StyledLeftNavBar>
      <Logo />
      <NavProfile />
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
