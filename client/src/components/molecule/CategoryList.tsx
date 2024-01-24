import styled from 'styled-components';
import { useSelector, useDispatch } from 'react-redux';
import { RootState } from '../../store/store';
import { select } from '../../store/slice/categorySlice';

interface CategoryProps {
  cateId: number;
  cateName: string;
}

//todo: CategoryList 받아오기

const CategoryList = () => {
  const { selectedId } = useSelector((state: RootState) => state.category);
  const dispatch = useDispatch();

  const categories: CategoryProps[] = [
    { cateId: 0, cateName: '전체' },
    { cateId: 1, cateName: '패션' },
    { cateId: 2, cateName: '뷰티' },
    { cateId: 3, cateName: '가구' },
  ];

  const onClickCategory = (cateId: number) => {
    dispatch(select(cateId));
  };

  return (
    <StyledCategoryList>
      {categories.map((category) => {
        return (
          <StyledCategoryItem
            onClick={() => onClickCategory(category.cateId)}
            isSelected={category.cateId === selectedId}
          >
            {category.cateName}
          </StyledCategoryItem>
        );
      })}
    </StyledCategoryList>
  );
};

export const StyledCategoryList = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  font-size: 18px;

  & > * {
    margin-bottom: 25px;
  }
`;

interface CategoryItemProps {
  isSelected: boolean;
}

const StyledCategoryItem = styled.li<CategoryItemProps>`
  font-weight: ${(props) => (props.isSelected ? 'bold' : 'normal')};
  cursor: pointer;
`;

export default CategoryList;
