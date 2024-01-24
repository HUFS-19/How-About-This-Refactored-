import styled from 'styled-components';

import { useNavigate } from 'react-router-dom';

interface CardImgProps {
  src?: string;
  alt?: string;
  link?: string;
  width?: string;
  height?: string;
}

const CardImg = ({ src, alt, link, width, height }: CardImgProps) => {
  const navigate = useNavigate();

  return (
    <StyledCardImg
      src={src}
      alt={alt}
      onClick={(e) => (link ? navigate(link) : e.stopPropagation())}
      width={width}
      height={height}
    />
  );
};

const StyledCardImg = styled.img`
  width: ${({ width }) => width || 'auto'};
  height: ${({ height }) => height || 'auto'};
  object-fit: cover;
  border-top-left-radius: 5px;
  border-top-right-radius: 5px;
  border-bottom: 2px solid var(--light-grey-color);
  transition: 0.1s ease-in-out;
`;

export default CardImg;
