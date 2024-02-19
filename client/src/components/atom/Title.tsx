import { FC } from 'react';
import styled from 'styled-components';

interface TitleProps {
  text: string;
  size?: string;
  align?: string;
}

const Title: FC<TitleProps> = ({ text, size, align }) => {
  return (
    <StyledText size={size} align={align}>
      {text}
    </StyledText>
  );
};

const StyledText = styled.p<{ size?: string; align?: string }>`
  font-family: var(--gowun-font);
  font-size: ${(props) => props.size || 'var(--title-size)'};
  font-weight: var(--title-weight);
  text-align: ${(props) => props.align || 'center'};
`;

export default Title;
