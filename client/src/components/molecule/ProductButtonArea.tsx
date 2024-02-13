import styled from 'styled-components';
import Button from '../atom/Button';

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faHeart } from '@fortawesome/free-solid-svg-icons';
import { FaShareAlt } from 'react-icons/fa';

const ProductButtonArea = () => {
  return (
    <StyledProductButtonArea>
      <Button
        text='구입하기'
        color='black'
        width='80%'
        style={{ padding: '7px 28px' }}
      />
      <StyledShareButton>
        <Button text='' color='white' style={{ padding: '16.5px' }} />
        <FaShareAlt />
      </StyledShareButton>
      <StyledLikeButton>
        <Button text='' color='white' style={{ padding: '16.5px' }} />
        <StyledLikeIcon icon={faHeart} />
      </StyledLikeButton>
    </StyledProductButtonArea>
  );
};

const StyledProductButtonArea = styled.div`
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  padding: 0px 15%;
`;

const StyledShareButton = styled.div``;

const StyledLikeButton = styled.div``;

const StyledLikeIcon = styled(FontAwesomeIcon)``;

export default ProductButtonArea;
