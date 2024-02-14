import styled from 'styled-components';
import Title from '../atom/Title';
import MediumText from '../atom/MediumText';

interface ProductInfoHeaderProps {
  productName: string;
  categoryName: string;
  tagNames: string[];
}

const ProductInfoHeader = ({
  productName,
  categoryName,
  tagNames,
}: ProductInfoHeaderProps) => {
  return (
    <StyledProductInfoHeader>
      <MediumText text={categoryName} />
      <Title text={productName} />
      <StyledTags>
        {tagNames.map((tag) => (
          <MediumText
            text={'#' + tag}
            color='var(--light-blue-color)'
            fontSize='16px'
          />
        ))}
      </StyledTags>
    </StyledProductInfoHeader>
  );
};

const StyledProductInfoHeader = styled.div`
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  > * {
    margin-bottom: 14px;
  }
`;

const StyledTags = styled.ul`
  display: flex;
  > * {
    padding: 0px 3px;
  }
`;

export default ProductInfoHeader;
