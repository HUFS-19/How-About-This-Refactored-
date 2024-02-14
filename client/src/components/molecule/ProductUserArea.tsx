import styled from 'styled-components';
import Button from '../atom/Button';
import ProfileImg from '../atom/ProfileImg';
import MediumText from '../atom/MediumText';

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faMessage } from '@fortawesome/free-solid-svg-icons';

interface ProductUserAreaProps {
  userName: string;
  userProfileImg: string;
}

const ProductUserArea = ({
  userName,
  userProfileImg,
}: ProductUserAreaProps) => {
  return (
    <StyledProductUserArea>
      <StyledProfile>
        <ProfileImg width='35px' style={{ marginRight: '8px' }} />
        <MediumText text={userName} fontSize='16px' />
      </StyledProfile>
      <StyledDMButton>
        <Button
          text='DM'
          color='white'
          style={{
            paddingLeft: '12px',
            paddingRight: '30px',
            paddingBottom: '5px',
          }}
        />
        <StyledMessageIcon icon={faMessage} />
      </StyledDMButton>
    </StyledProductUserArea>
  );
};

const StyledProductUserArea = styled.div`
  display: flex;
  justify-content: space-between;
  width: 100%;
  align-items: center;
  margin-top: 30px;
  margin-bottom: 13px;
  padding: 0px 15%;
`;

const StyledProfile = styled.div`
  display: flex;
  align-items: center;
  cursor: pointer;
`;

const StyledDMButton = styled.div`
  position: relative;
`;

const StyledMessageIcon = styled(FontAwesomeIcon)`
  position: absolute;
  top: 26%;
  right: 14%;
`;

export default ProductUserArea;
