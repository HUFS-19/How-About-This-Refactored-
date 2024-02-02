import styled from 'styled-components';

interface TitleProps {
  text: string;
}

const Title = ({ text }: TitleProps) => {
  return <StyledText>{text}</StyledText>;
};

const StyledText = styled.p`
  font-family: var(--gowun-font);
  font-size: var(--title-size);
  font-weight: var(--title-weight);
  text-align: center;
`;

export default Title;
