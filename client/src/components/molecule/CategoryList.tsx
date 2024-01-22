import styled from 'styled-components';

interface CategoryProps {
  cateId: number;
  cateName: string;
}

//todo: CategoryList 받아오기
//todo: 카테고리 선택 가능하게 변경

const CategoryList = () => {
  const categories: CategoryProps[] = [
    { cateId: 1, cateName: '패션' },
    { cateId: 2, cateName: '뷰티' },
    { cateId: 3, cateName: '가구' },
  ];

  return (
    <StyledCategoryList>
      <li>전체</li>
      <li>좋아요 목록</li>
      {categories.map((category) => {
        return <li>{category.cateName}</li>;
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

export default CategoryList;
