import styled from 'styled-components';

type directionType = 'column' | 'row';
type justifyContentType =
  | 'flex-start'
  | 'flex-end'
  | 'center'
  | 'left'
  | 'right'
  | 'space-between'
  | 'space-evenly'
  | 'space-around';

type positionType = 'relative' | 'absolute' | 'fixed' | 'static';

interface FlexBoxProps {
  children: JSX.Element | JSX.Element[];
  flexDirection?: directionType;
  justifyContent?: justifyContentType;
  alignItems?: string;
  position?: positionType;
}

export const FlexBox = ({
  children,
  flexDirection,
  justifyContent,
  alignItems,
  position,
}: FlexBoxProps) => {
  return (
    <StyledFlexBox
      style={{
        display: 'flex',
        flexDirection,
        justifyContent,
        alignItems,
        position,
      }}
    >
      {children}
    </StyledFlexBox>
  );
};

const StyledFlexBox = styled.div``;
