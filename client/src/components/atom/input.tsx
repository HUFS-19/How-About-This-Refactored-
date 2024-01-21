import styled from 'styled-components';
import { eventFunction } from '../../utils/types/eventFunction';

interface InputProps {
  type?: string;
  placeholder?: string;
  onChange?: eventFunction;
  onKeyDown?: eventFunction;
  value?: string;
  width?: string;
}

export const Input = ({
  type,
  placeholder,
  onChange,
  onKeyDown,
  value,
  width,
}: InputProps) => {
  return (
    <StyledInput
      type={type}
      placeholder={placeholder}
      onChange={onChange}
      onKeyDown={onKeyDown}
      value={value}
      width={width}
    />
  );
};

const StyledInput = styled.input`
  width: ${({ width }) => (width ? width : '700px')};
  padding-top: 9px;
  padding-bottom: 10px;
  padding-left: 40px;
  background-color: var(--bg-grey-color);
  border: none;
  border-radius: 5px;
  font-size: 16px;
  font-family: var(--noto-font);
  color: rgba(0, 0, 0, 0.6);
  &:focus {
    outline: none;
  }
`;
