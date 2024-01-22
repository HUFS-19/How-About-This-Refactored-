import Button from '../atom/Button';
import styled from 'styled-components';
import ProfileIcon from '../atom/ProfileImg';

//todo: user정보에 따라 profileIcon src, username 변경

const NavProfile = () => {
  return (
    <StyledNavProfile>
      <ProfileIcon />
      <p>username</p>
      <Button text='로그아웃' color='black' width='130px' height='35px' />
    </StyledNavProfile>
  );
};

export const StyledNavProfile = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;

  & > * {
    margin-bottom: 10px;
  }
`;

export default NavProfile;
