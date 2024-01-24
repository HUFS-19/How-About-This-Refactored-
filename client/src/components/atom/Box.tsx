import styled from 'styled-components';

interface BoxProps {
  width?: string;
  height?: string;
  backgroundColor?: string;
  children?: JSX.Element | JSX.Element[];
  style?: object;
}

const Box = ({ width, height, backgroundColor, children, style }: BoxProps) => {
  return (
    <StyledBox
      width={width}
      height={height}
      backgroundColor={backgroundColor}
      style={style}
    >
      {children}
    </StyledBox>
  );
};

const StyledBox = styled.div<BoxProps>`
  width: ${({ width }) => width || 'auto'};
  height: ${({ height }) => height || 'auto'};
  background-color: ${({ backgroundColor }) => backgroundColor || 'white'};
  padding: 3%;
  box-shadow: var(--box-shadow);
`;

export default Box;
