import styled from 'styled-components';

interface MediumTextProps {
  text: string;
}

const MediumText = ({ text }: MediumTextProps) => {
  return <StyledMediumText>{text}</StyledMediumText>;
};

const StyledMediumText = styled.p`
  font-family: var(--noto-font);
  font-size: 18px;
  text-overflow: ellipsis;
  word-break: break-all;
  overflow: hidden;
  white-space: nowrap;
`;

export default MediumText;
