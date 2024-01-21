import styled from 'styled-components';

interface WrapperProps {
  children?: JSX.Element | JSX.Element[];
  width?: string;
  height?: string;
  margin?: string;
  marginTop?: string;
  marginBottom?: string;
  marginLeft?: string;
  marginRight?: string;
  padding?: string;
  paddingTop?: string;
  paddingBottom?: string;
  paddingLeft?: string;
  paddingRight?: string;
  backgroundColor?: string;
  color?: string;
  zIndex?: string;
}

const Wrapper = ({ children, width, padding, zIndex }: WrapperProps) => {
  return (
    <StyledWrapper width={width} padding={padding} zIndex={zIndex}>
      {children}
    </StyledWrapper>
  );
};

const StyledWrapper = styled.div<WrapperProps>`
  width: ${({ width }) => (width ? width : 'auto')};
  background-color: ${({ backgroundColor }) =>
    backgroundColor ? backgroundColor : 'white'};
  box-shadow: 0px 5px 3px 0.5px var(--light-grey-color);
  padding: ${({ padding }) => (padding ? padding : '0px')};
  z-index: ${({ zIndex }) => (zIndex ? zIndex : '0')};
`;

export default Wrapper;
