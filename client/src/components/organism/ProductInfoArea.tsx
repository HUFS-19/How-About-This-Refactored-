import styled from 'styled-components';
import Title from '../atom/Title';
import MediumText from '../atom/MediumText';

interface ProductInfoAreaProps {
  productName: string;
  categoryName: string;
  tagNames: string[];
}

const ProductInfoArea = ({
  productName,
  categoryName,
  tagNames,
}: ProductInfoAreaProps) => {
  return (
    <StyledProductInfoArea>
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
    </StyledProductInfoArea>
  );
};

const StyledProductInfoArea = styled.div`
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

export default ProductInfoArea;
