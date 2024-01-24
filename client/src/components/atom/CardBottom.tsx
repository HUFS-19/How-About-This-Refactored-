import styled from 'styled-components';
import MediumText from './MediumText';

interface CardBottomProps {
  text: string;
}

const CardBottom = ({ text }: CardBottomProps) => {
  return (
    <StyledCardBottom>
      <MediumText text={text} />
    </StyledCardBottom>
  );
};

const StyledCardBottom = styled.div`
  padding: 15px 18px;
  background-color: white;
`;

export default CardBottom;
