import styled from 'styled-components';
import { eventFunction } from '../../utils/types/eventFunction';

interface SelectProps {
  options: { value: string; name: string }[];
  onChange?: eventFunction;
  width?: string;
}

const Select = ({ options, onChange, width }: SelectProps) => {
  return (
    <StyledSelect onChange={onChange} width={width}>
      {options.map((option) => {
        return <option value={option.value}>{option.name}</option>;
      })}
    </StyledSelect>
  );
};

const StyledSelect = styled.select<{ width?: string }>`
  width: ${({ width }) => width || '150px'};
  padding-top: 8px;
  padding-bottom: 8px;
  padding-left: 15px;
  margin: 0px 6px;
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

export default Select;
