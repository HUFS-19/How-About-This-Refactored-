import { FC } from 'react';
import styled from 'styled-components';

interface ButtonProps {
  onClick?: () => void;
  id?: string;
  text: string;
  width?: string;
  height?: string;
  color?: 'black' | 'white' | 'grey';
}

const Button: FC<ButtonProps> = ({
  onClick,
  id,
  text,
  width,
  height,
  color = 'black',
}) => {
  return (
    <StyledButton
      onClick={onClick}
      id={id}
      width={width}
      height={height}
      color={color}
    >
      {text}
    </StyledButton>
  );
};

interface StyledButtonProps {
  width?: string;
  height?: string;
  color?: 'black' | 'white' | 'grey';
}

const getButtonStyles = (props: StyledButtonProps) => {
  switch (props.color) {
    case 'white':
      return `
        background-color: white;
        color: black;
      `;
    case 'grey':
      return `
        background-color: lightgray;
        color: white;
        border: none;
      `;
    case 'black':
    default:
      return `
        background-color: black;
        color: white;
        border: none;
      `;
  }
};

export const StyledButton = styled.button<StyledButtonProps>`
  ${(props) => getButtonStyles(props)};
  border-radius: 5px;
  width: ${(props) => props.width || 'auto'};
  height: ${(props) => props.height || 'auto'};
  shadow: none;
  cursor: pointer;
  text-align: center;
  font-family: var(--noto);
  font-weight: 600;
  font-size: 16px;
`;

export default Button;
