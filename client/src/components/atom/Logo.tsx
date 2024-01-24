import styled from 'styled-components';
import logoImg from '../../assets/logo.png';

export const Logo = () => {
  return <StyledLogo src={logoImg} />;
};

export const StyledLogo = styled.img`
  width: 250px;
  height: auto;
  cursor: pointer;
`;

export default Logo;
