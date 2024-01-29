import styled from 'styled-components';

interface MainBoxProps {
  children: JSX.Element | JSX.Element[];
}

const MainBox = ({ children }: MainBoxProps) => {
  return <StyledMainBox>{children}</StyledMainBox>;
};

const StyledMainBox = styled.div`
  padding-top: 60px;
  padding-bottom: 60px;
  padding-left: 90px;
  padding-right: 90px;
  margin-left: 270px;
  margin-top: 55px;
`;

export default MainBox;
