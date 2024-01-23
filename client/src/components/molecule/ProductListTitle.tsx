import styled from 'styled-components';
import Title from '../atom/Title';
import Select from '../atom/Select';
import { sortOptions } from '../../utils/constants/constants';

const ProductListTitle = () => {
  return (
    <StyledProductListTitle>
      <Title text='전체' />
      <Select
        options={sortOptions.map((option: string, index: number) => {
          return { value: String(index), name: option };
        })}
      />
    </StyledProductListTitle>
  );
};

const StyledProductListTitle = styled.div`
  display: flex;
  justify-content: space-between;
`;

export default ProductListTitle;
