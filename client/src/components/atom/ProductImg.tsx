import styled from 'styled-components';

import { useNavigate } from 'react-router-dom';

interface ProductImgProps {
  src?: string;
  alt?: string;
  link?: string;
  width?: string;
}

const ProductImg = ({ src, alt, link, width }: ProductImgProps) => {
  const navigate = useNavigate();

  return (
    <StyledProductImg
      src={src}
      alt={alt}
      onClick={(e) => (link ? navigate(link) : e.stopPropagation())}
      width={width}
    />
  );
};

const StyledProductImg = styled.img`
  width: ${({ width }) => (width ? width : '100px')};
`;

export default ProductImg;
