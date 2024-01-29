import styled from 'styled-components';

interface ProductImgProps {
  src: string;
  alt?: string;
}

const ProductImg = ({ src, alt }: ProductImgProps) => {
  return <StyledProductImg src={src} alt={alt} />;
};

const StyledProductImg = styled.img<{}>`
  width: 500px;
  height: 400px;
  object-fit: cover;
  cursor: pointer;
`;

export default ProductImg;
