import styled from 'styled-components';
import ProductImg from '../atom/ProductImg';
import HeartIcon from '../atom/HeartIcon';
import MediumText from '../atom/MediumText';

interface ProductCardProps {
  name: string;
  imgSrc: string;
}

const ProductCard = ({ name, imgSrc }: ProductCardProps) => {
  return (
    <StyledProductCard>
      <ProductImg src={imgSrc} />
      <HeartIcon />
      <MediumText text={name} />
    </StyledProductCard>
  );
};

const StyledProductCard = styled.div`
  position: relative;
  margin: 12px 12px;
  display: flex;
  flex-direction: column;
  border: 2px solid var(--light-grey-color);
  border-radius: 3px;
  cursor: pointer;
  overflow: hidden;
`;

export default ProductCard;
