import styled from 'styled-components';

interface CategoryProps {
  cateId: number;
  cateName: string;
  clicked: false;
}

const CategoryList = () => {
  const categories: CategoryProps[] = [
    { cateId: 1, cateName: '패션', clicked: false },
    { cateId: 2, cateName: '뷰티', clicked: false },
    { cateId: 3, cateName: '가구', clicked: false },
  ];

  return (
    <StyledCategoryList>
      {categories.map((category) => {
        return <li>{category.cateName}</li>;
      })}
    </StyledCategoryList>
  );
};

export const StyledCategoryList = styled.div``;

export default CategoryList;
