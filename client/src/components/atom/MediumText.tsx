import styled from 'styled-components';

interface MediumTextProps {
  text: string;
  color?: string;
  fontSize?: string;
}

const MediumText = ({ text, color, fontSize }: MediumTextProps) => {
  return (
    <StyledMediumText color={color} fontSize={fontSize}>
      {text}
    </StyledMediumText>
  );
};

const StyledMediumText = styled.p<{ fontSize?: string }>`
  font-family: var(--noto-font);
  font-size: ${({ fontSize }) => fontSize || '18px'};
  color: ${({ color }) => color || 'black'};
  text-align: center;
  text-overflow: ellipsis;
  word-break: break-all;
  overflow: hidden;
  white-space: nowrap;
`;

export default MediumText;
